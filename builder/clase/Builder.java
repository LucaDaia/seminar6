package builder.clase;

public class Builder implements Builderable{

    private ContBancar cont;


    public Builder() {
        this.cont = new ContBancar(false,false, "anonim", false);
    }

    public Builder setPrimesteSalariu(boolean primesteSalariu) {
        cont.setPrimesteSalariu(primesteSalariu);
        return this;
    }

    public Builder setCardAtasat(boolean cardAtasat) {
        cont.setCardAtasat(cardAtasat);
        return this;
    }

    public Builder setNumeClient(String numeClient) {
        cont.setNumeClient(numeClient);
        return this;
    }

    public Builder setInternetBanking(boolean internetBanking) {
        cont.setInternetBanking(internetBanking);
        return this;
    }

    @Override
    public ContBancar build() {
        return cont;
    }
}
