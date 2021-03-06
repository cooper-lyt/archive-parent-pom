package cc.coopersoft.archives.room.model;

import javax.persistence.*;

@Entity
@Table(name = "BOX")
public class Box {

    @Id
    @Column(name = "BOX_ID", unique = true, nullable = false, length = 32)
    String id;

    @Column(name = "_NUMBER", unique = true, nullable = false, length = 32)
    String number;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CELL_ID", nullable = false)
    Cell cell;

    @Column(name = "_FULL", nullable = false)
    boolean full;

    @Column(name = "EMPTY", nullable = false)
    boolean empty;

    @Column(name = "_SIZE", nullable = false)
    int size;

    @Column(name = "SEQ", nullable = false)
    int seq;

    @Column(name = "DESCRIPTION",  length = 256)
    String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
