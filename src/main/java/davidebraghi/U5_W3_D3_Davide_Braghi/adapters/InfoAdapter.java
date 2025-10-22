package davidebraghi.U5_W3_D3_Davide_Braghi.adapters;

import davidebraghi.U5_W3_D3_Davide_Braghi.entities.Info;
import davidebraghi.U5_W3_D3_Davide_Braghi.interfaces.DataSource;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public void getNomeCompleto(String nomeCompleto) {
        info.setNome("Mario");
        info.setCognome("Rossi");
    }

    @Override
    public String getNomeCompleto() {
        return "";
    }

    @Override
    public int getEta() {
        return 0;
    }
}
