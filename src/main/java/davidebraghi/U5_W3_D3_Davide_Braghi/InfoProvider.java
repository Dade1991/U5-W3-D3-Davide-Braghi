package davidebraghi.U5_W3_D3_Davide_Braghi;

import davidebraghi.U5_W3_D3_Davide_Braghi.adapters.InfoAdapter;
import davidebraghi.U5_W3_D3_Davide_Braghi.entities.Info;
import davidebraghi.U5_W3_D3_Davide_Braghi.interfaces.DataSource;

public class InfoProvider {
    public static DataSource getDataSource() {
        Info info = new Info();
        info.setNome("Franco");
        info.setCognome("Rossi");
        info.setDataDiNascita(12 - 3 - 1960);

        return new InfoAdapter(info);
    }
}