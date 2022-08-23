// Generated with g9.

package com.juan.pt.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Juegos implements Serializable {

    /** Primary key. */
    protected static final String PK = "idJuego";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_juego", unique=true, nullable=false)
    private int idJuego;
    @Column(name="nombre_juego", nullable=false, length=100)
    private String nombreJuego;
    @Column(name="genero_juego", nullable=false, length=100)
    private String generoJuego;
    @Column(name="calificacion_edad", nullable=false)
    private int calificacionEdad;
    @OneToMany(mappedBy="juegos")
    private Set<Partidas> partidas;

    /** Default constructor. */
    public Juegos() {
        super();
    }

    /**
     * Access method for idJuego.
     *
     * @return the current value of idJuego
     */
    public int getIdJuego() {
        return idJuego;
    }

    /**
     * Setter method for idJuego.
     *
     * @param aIdJuego the new value for idJuego
     */
    public void setIdJuego(int aIdJuego) {
        idJuego = aIdJuego;
    }

    /**
     * Access method for nombreJuego.
     *
     * @return the current value of nombreJuego
     */
    public String getNombreJuego() {
        return nombreJuego;
    }

    /**
     * Setter method for nombreJuego.
     *
     * @param aNombreJuego the new value for nombreJuego
     */
    public void setNombreJuego(String aNombreJuego) {
        nombreJuego = aNombreJuego;
    }

    /**
     * Access method for generoJuego.
     *
     * @return the current value of generoJuego
     */
    public String getGeneroJuego() {
        return generoJuego;
    }

    /**
     * Setter method for generoJuego.
     *
     * @param aGeneroJuego the new value for generoJuego
     */
    public void setGeneroJuego(String aGeneroJuego) {
        generoJuego = aGeneroJuego;
    }

    /**
     * Access method for calificacionEdad.
     *
     * @return the current value of calificacionEdad
     */
    public int getCalificacionEdad() {
        return calificacionEdad;
    }

    /**
     * Setter method for calificacionEdad.
     *
     * @param aCalificacionEdad the new value for calificacionEdad
     */
    public void setCalificacionEdad(int aCalificacionEdad) {
        calificacionEdad = aCalificacionEdad;
    }

    /**
     * Access method for partidas.
     *
     * @return the current value of partidas
     */
    public Set<Partidas> getPartidas() {
        return partidas;
    }

    /**
     * Setter method for partidas.
     *
     * @param aPartidas the new value for partidas
     */
    public void setPartidas(Set<Partidas> aPartidas) {
        partidas = aPartidas;
    }

    /**
     * Compares the key for this instance with another Juegos.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Juegos and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Juegos)) {
            return false;
        }
        Juegos that = (Juegos) other;
        if (this.getIdJuego() != that.getIdJuego()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Juegos.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Juegos)) return false;
        return this.equalKeys(other) && ((Juegos)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getIdJuego();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Juegos |");
        sb.append(" idJuego=").append(getIdJuego());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idJuego", Integer.valueOf(getIdJuego()));
        return ret;
    }

}
