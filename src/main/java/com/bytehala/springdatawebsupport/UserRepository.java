package com.bytehala.springdatawebsupport;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {}