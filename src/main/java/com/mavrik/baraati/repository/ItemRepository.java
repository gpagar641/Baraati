package com.mavrik.baraati.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mavrik.baraati.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
