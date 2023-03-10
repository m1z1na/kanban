package Kanban.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "scheduler")

public class Scheduler {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;
    private String title;
    private LocalDateTime start;
    private LocalDateTime end;

    public Scheduler(Long id, String title, LocalDateTime start, LocalDateTime end) {
        this.id = id;
        this.title = title;
        this.start = start;
        this.end = end;
    }

    public Scheduler() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Scheduler{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}