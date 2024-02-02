package controller;

import Servis.SehirServisi;
import dao.SehirDAO;
import model.Sehir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sehirler")
public class Kontrolcu {
    @Autowired
    public SehirServisi sehirServisi;



    @PostMapping
    public void sehirEkle(@RequestBody Sehir sehir) {
        sehirServisi.sehirEkle(sehir);
    }
}
