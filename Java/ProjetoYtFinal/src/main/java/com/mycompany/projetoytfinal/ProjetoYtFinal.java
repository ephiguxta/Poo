package com.mycompany.projetoytfinal;

import com.mycompany.projetoytfinal.entities.Gafanhoto;
import com.mycompany.projetoytfinal.entities.Video;
import com.mycompany.projetoytfinal.entities.Visualizacao;

public class ProjetoYtFinal {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Titanic 2");
        v[1] = new Video("Nasce uma estrela");
        v[2] = new Video("Barbie");
        
        Gafanhoto p = new Gafanhoto("Aroldo", 21, 'M', "Adox");
        
        Visualizacao vis = new Visualizacao(p, v[0]);
        vis.avaliar(3);
        
        System.out.println(v[0].getAvaliacao());
    }
}
