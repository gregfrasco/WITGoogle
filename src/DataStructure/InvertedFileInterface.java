/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author Greg
 */
public interface InvertedFileInterface<D,W> {
        
    public void add(D document, W word);
    public void remove(D document, W word);
    public int capasity();
    public void clear();
    public boolean isEmpty();
    public boolean containsWord(W word);
    public boolean contains(D document,W word);
    public D search(W word);
    public D[] search(W[] words);
    public int size();
    
}
