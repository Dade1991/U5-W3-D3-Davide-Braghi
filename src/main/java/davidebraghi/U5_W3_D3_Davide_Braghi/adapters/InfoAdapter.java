package davidebraghi.U5_W3_D3_Davide_Braghi.adapters;

import davidebraghi.U5_W3_D3_Davide_Braghi.entities.Info;
import davidebraghi.U5_W3_D3_Davide_Braghi.interfaces.DataSource;

import java.util.Calendar;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNomeCompleto();
    }

    @Override
    public int getEta() {
        Calendar birth = Calendar.getInstance();
        birth.setTime(info.getDataDiNascita());

        Calendar today = Calendar.getInstance();

        int eta = (today.get(Calendar.YEAR) - birth.get(Calendar.YEAR));

        if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
            eta--;
        }

        return eta;
    }
}
