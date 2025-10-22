package davidebraghi.U5_W3_D3_Davide_Braghi.entities;

import davidebraghi.U5_W3_D3_Davide_Braghi.interfaces.DataSource;

public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
