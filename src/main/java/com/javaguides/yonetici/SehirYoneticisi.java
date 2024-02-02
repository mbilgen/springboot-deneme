package com.javaguides.yonetici;


import Servis.SehirServisi;
import controller.Kontrolcu;
import dao.SehirDAO;
import model.Sehir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SehirYoneticisi {
	@Autowired
	private  static Kontrolcu kontrolcu = new Kontrolcu();

	public static void main(String[] args) {
		SpringApplication.run(SehirYoneticisi.class, args);

		ekle();

	}
	private static void ekle(){
		Sehir sehir = new Sehir(1, "Ankara",300);
		kontrolcu.sehirEkle(sehir);
	}



}
