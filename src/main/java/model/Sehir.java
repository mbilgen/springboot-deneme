package model;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "Sehirler")
public class Sehir {
    private int id;

    private String isim;
    private int nufus;


    public Sehir(int id, String isim, int nufus) {

        this.id = id;
        this.isim = isim;
        this.nufus = nufus;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getNufus() {
        return nufus;
    }

    public void setNufus(int nufus) {
        this.nufus = nufus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.isim);
        hash = 79 * hash + this.nufus;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sehir other = (Sehir) obj;
        if (this.nufus != other.nufus) {
            return false;
        }
        if (!Objects.equals(this.isim, other.isim)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Şehir{");
        sb.append("id=").append(id);
        sb.append(", isim='").append(isim).append('\'');
        sb.append(", nüfus='").append(nufus);
        sb.append('}');
        return sb.toString();
    }
}
