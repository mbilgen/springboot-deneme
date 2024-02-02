package Servis;

import controller.Kontrolcu;
import dao.SehirDAO;
import model.Sehir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SehirServisi {
    @Autowired
    public SehirDAO sehirDAO;
    public void sehirEkle (Sehir sehir){
        sehirDAO.saveAndFlush(sehir);
    }

}
