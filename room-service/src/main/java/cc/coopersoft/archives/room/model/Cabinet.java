package cc.coopersoft.archives.room.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CABINET")
public class Cabinet {

    @Id
    @Column(name = "CABINET_ID", nullable = false, length = 16 , unique = true)
    String id;

    @Column(name = "NAME", nullable = false, length = 8)
    String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RACK_ID", nullable = false)
    Rack rack;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true, mappedBy = "cabinet")
    Set<Cell> cells = new HashSet<>(0);

    @Column(name = "SEQ", nullable = false)
    int seq;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rack getRack() {
        return rack;
    }

    public void setRack(Rack rack) {
        this.rack = rack;
    }

    public Set<Cell> getCells() {
        return cells;
    }

    public void setCells(Set<Cell> cells) {
        this.cells = cells;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }
}
