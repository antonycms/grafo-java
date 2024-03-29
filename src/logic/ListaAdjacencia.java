/**
 *
 * @author Antony Carlos
 */
package logic;

import geometry.Grafo;
import geometry.Vertice;
import java.util.List;

public abstract class ListaAdjacencia {
    
    /**
     * metodo: getList
     * 
     * @param grafo
     * @return lista (String)
     * 
     * retorna um texto onde os vertices sao referenciados pelo indice
     */
    public static String getList(Grafo grafo){
        String list = "";
        List<Vertice> vertices = grafo.getVertices();
        
        for (Vertice vertice :vertices) {
            List<Vertice> ligacoes = vertice.getLigacoes();
            
            list += vertice.getLocal();

            for(Vertice vertice_ligado : ligacoes) {
                list += " -> "+vertice_ligado.getLocal();
            }
            
            list += "\n";
        }
        
        return list;
    }
    
    /**
     * metodo: getList
     * 
     * @param grafo
     * @return lista (String)
     * 
     * retorna um texto onde os vertices sao referenciados pelo nome
     */
    public static String getListNome(Grafo grafo){
        String list = "";
        List<Vertice> vertices = grafo.getVertices();
        
        for (Vertice vertice :vertices) {
            List<Vertice> ligacoes = vertice.getLigacoes();
            
            list += vertice.getNome();

            for(Vertice vertice_ligado : ligacoes) {
                list += " -> "+vertice_ligado.getNome();
            }
            
            list += "\n";
        }
        
        return list;
    }
}
