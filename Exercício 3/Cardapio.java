public class Cardapio {
    private String prato;
    private String ingredientes;

    public Cardapio(String prato, String ingredientes) {
        this.prato = prato;
        this.ingredientes = ingredientes;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }


}