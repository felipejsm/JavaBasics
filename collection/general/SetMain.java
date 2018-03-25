import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Banda bandaA = new Banda();
        bandaA.setAno(2000);
        bandaA.setAtiva(true);
        bandaA.setGenero("Post HC");
        bandaA.setNome("Circa Survive");
        Banda bandaB = new Banda();
        bandaB.setAno(2000);
        bandaB.setAtiva(true);
        bandaB.setGenero("Post HC");
        bandaB.setNome("Circa Survive");
        Banda bandaC = new Banda();
        bandaC.setAno(2001);
        bandaC.setAtiva(true);
        bandaC.setGenero("Post HC");
        bandaC.setNome("Circa Survive");

        Collection<Banda> bandasSet = new HashSet<>();
        bandasSet.add(bandaA);
        bandasSet.add(bandaB);
        bandasSet.add(bandaC);
        System.out.println(bandasSet.size());
        
    }
}
class Banda {
    private String nome;
    private String genero;
    private int ano;
    private boolean ativa;

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }
    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the ativa
     */
    public boolean isAtiva() {
        return ativa;
    }
    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
    /**
     * @param ativa the ativa to set
     */
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Nome "+this.nome+"\nGenêro "+this.genero+"\nAno "+this.ano+"\nAtiva? "+this.ativa;
    }
}