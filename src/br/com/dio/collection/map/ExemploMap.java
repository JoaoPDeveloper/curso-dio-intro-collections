package br.com.dio.collection.map;


import java.lang.reflect.Constructor;
import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrosPopulares.toString());
        
        System.out.println("substitua o consumo do gol por 15.2 KM/l :" );
        carrosPopulares.put("gol", 14.9);
        System.out.println(carrosPopulares);

        System.out.println("confira se o modelo tucson está no dicionário:" + carrosPopulares.get("uno"));

        System.out.println("exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        
        System.out.println("exiba o modelo mais econômico e seu consumo");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String,Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "" ;        

        for(Map.Entry<String,Double> entry: entries)
        {
            if(entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente : " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        
        System.out.println("exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for(Map.Entry<String,Double> entry: carrosPopulares.entrySet()) 
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
            System.out.println
            ("modelo menos eficiente : " + modeloMenosEficiente + " - " + consumoMenosEficiente);
             }
            System.out.println("Exiba a soma dos consumos: ");
            Iterator<Double> iterator = carrosPopulares.values().iterator();
            Double soma = 0d; 
            while(iterator.hasNext()){
                soma += iterator.next();
            }            
            System.out.println("Exiba a soma dos consumos: " + soma);
            System.out.println("Exiba a média dos consumos deste dicionário de carros : " + (soma/carrosPopulares.size()));
            System.out.println("Remova os modelos com o consumo igual a 15,6");
            System.out.println(carrosPopulares);
            
                System.out.println("Apague o dicionario de carros: ");
                carrosPopulares.clear();

                System.out.println("Confira se o dicionario está vazio : " + carrosPopulares.isEmpty());
        }
            
    }
class Livro{
    private String nome;
    private Integer paginas;
    public Livro (String nome, Integer paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome(){
        return nome;
    }
    public Integer getPaginas(){
        return paginas;
    }
    @Override 
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }
    @Override
        public String toString(){
            return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" paginas +
                '}';       
    }
}