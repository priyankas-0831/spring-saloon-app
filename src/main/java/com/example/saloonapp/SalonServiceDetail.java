package com.example.saloonapp;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString
@Service
public class SalonServiceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    String description;
    Long price;
    Integer timeInMinutes;

    @OneToMany(mappedBy = "salonServiceDetail", cascade = CascadeType.ALL)
    List<Slot> slot;




}
