package com.first;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employdao extends JpaRepository<employ,String> {

}
