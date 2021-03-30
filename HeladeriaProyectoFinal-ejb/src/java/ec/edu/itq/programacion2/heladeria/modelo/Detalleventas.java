/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "detalleventas")
@NamedQueries({
    @NamedQuery(name = "Detalleventas.findAll", query = "SELECT d FROM Detalleventas d")})
public class Detalleventas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetalleventas")
    private Integer iddetalleventas;
    @Column(name = "cantidad")
    private Integer cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precioventa")
    private BigDecimal precioventa;
    @JoinColumn(name = "producto_idproducto", referencedColumnName = "idproducto")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Produto productoIdproducto;
    @JoinColumn(name = "ventas_idventas", referencedColumnName = "idventas")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ventas ventasIdventas;

    public Detalleventas() {
    }

    public Detalleventas(Integer iddetalleventas) {
        this.iddetalleventas = iddetalleventas;
    }

    public Integer getIddetalleventas() {
        return iddetalleventas;
    }

    public void setIddetalleventas(Integer iddetalleventas) {
        this.iddetalleventas = iddetalleventas;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(BigDecimal precioventa) {
        this.precioventa = precioventa;
    }

    public Produto getProductoIdproducto() {
        return productoIdproducto;
    }

    public void setProductoIdproducto(Produto productoIdproducto) {
        this.productoIdproducto = productoIdproducto;
    }

    public Ventas getVentasIdventas() {
        return ventasIdventas;
    }

    public void setVentasIdventas(Ventas ventasIdventas) {
        this.ventasIdventas = ventasIdventas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetalleventas != null ? iddetalleventas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalleventas)) {
            return false;
        }
        Detalleventas other = (Detalleventas) object;
        if ((this.iddetalleventas == null && other.iddetalleventas != null) || (this.iddetalleventas != null && !this.iddetalleventas.equals(other.iddetalleventas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.heladeria.modelo.Detalleventas[ iddetalleventas=" + iddetalleventas + " ]";
    }
    
}
