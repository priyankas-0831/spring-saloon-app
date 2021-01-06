package com.example.saloonapp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Slot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name="selected_service_id")
    private SalonServiceDetail salonServiceDetail;

    String stylistName;

    LocalDateTime slotFor;

    private SlotStatus status;

    LocalDateTime lockedAt;
    LocalDateTime confirmedAt;

}

enum  SlotStatus {
    AVAILABLE,LOCKED,CONFIRMED,CANCELLED
}
