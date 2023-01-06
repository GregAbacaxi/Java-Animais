/*IFPR - CAMPUS CASCAVEL
Aluno: Gregor Umbelino
Turma: 3º Informática*/

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.*;

public class Animal {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return(nome);
    }

    public String emiteSom(String tipo){
        if (tipo == "cavalo"){
            try {
                InputStream input = getClass().getResourceAsStream("./cavalo.wav");
                Clip oClip = AudioSystem.getClip();
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(input);
                oClip.open(audioInput);
        
                oClip.loop(0);
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                
                    }
                });
            } catch (Exception e) {
            }
            return ("Relinchando*");

        } else if (tipo == "cachorro"){
            try {
                InputStream input = getClass().getResourceAsStream("./cachorro.wav");
                Clip oClip = AudioSystem.getClip();
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(input);
                oClip.open(audioInput);
        
                oClip.loop(0);
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                
                    }
                });
            } catch (Exception e) {
            }
            return ("Latindo*");

        } else if (tipo == "preguica"){
            try {
                InputStream input = getClass().getResourceAsStream("./preguica.wav");
                Clip oClip = AudioSystem.getClip();
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(input);
                oClip.open(audioInput);
        
                oClip.loop(0);
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                
                    }
                });
            } catch (Exception e) {
            }
            return ("Sons de Preguiça*");
            
        } else {
            return("Som*");
        }

    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return (idade);
    }

    public String getClasse(){
        return "animal";
    }
}