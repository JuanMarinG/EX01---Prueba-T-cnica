// Generated with g9.

package com.juan.pt.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Partidas implements Serializable {

    /** Primary key. */
    protected static final String PK = "idPartida";

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
    @Column(name="id_partida", unique=true, nullable=false)
    private int idPartida;
    @Column(name="nombre_partida", nullable=false, length=150)
    private String nombrePartida;
    @ManyToOne(optional=false)
    @JoinColumn(name="juego_partida", nullable=false)
    private Juegos juegos;
    @ManyToOne(optional=false)
    @JoinColumn(name="anfitrion", nullable=false)
    private Perfiles perfiles;

    /** Default constructor. */
    public Partidas() {
        super();
    }

    /**
     * Access method for idPartida.
     *
     * @return the current value of idPartida
     */
    public int getIdPartida() {
        return idPartida;
    }

    /**
     * Setter method for idPartida.
     *
     * @param aIdPartida the new value for idPartida
     */
    public void setIdPartida(int aIdPartida) {
        idPartida = aIdPartida;
    }

    /**
     * Access method for nombrePartida.
     *
     * @return the current value of nombrePartida
     */
    public String getNombrePartida() {
        return nombrePartida;
    }

    /**
     * Setter method for nombrePartida.
     *
     * @param aNombrePartida the new value for nombrePartida
     */
    public void setNombrePartida(String aNombrePartida) {
        nombrePartida = aNombrePartida;
    }

    /**
     * Access method for juegos.
     *
     * @return the current value of juegos
     */
    public Juegos getJuegos() {
        return juegos;
    }

    /**
     * Setter method for juegos.
     *
     * @param aJuegos the new value for juegos
     */
    public void setJuegos(Juegos aJuegos) {
        juegos = aJuegos;
    }

    /**
     * Access method for perfiles.
     *
     * @return the current value of perfiles
     */
    public Perfiles getPerfiles() {
        return perfiles;
    }

    /**
     * Setter method for perfiles.
     *
     * @param aPerfiles the new value for perfiles
     */
    public void setPerfiles(Perfiles aPerfiles) {
        perfiles = aPerfiles;
    }

    /**
     * Compares the key for this instance with another Partidas.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Partidas and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Partidas)) {
            return false;
        }
        Partidas that = (Partidas) other;
        if (this.getIdPartida() != that.getIdPartida()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Partidas.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Partidas)) return false;
        return this.equalKeys(other) && ((Partidas)other).equalKeys(this);
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
        i = getIdPartida();
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
        StringBuffer sb = new StringBuffer("[Partidas |");
        sb.append(" idPartida=").append(getIdPartida());
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
        ret.put("idPartida", Integer.valueOf(getIdPartida()));
        return ret;
    }

}
