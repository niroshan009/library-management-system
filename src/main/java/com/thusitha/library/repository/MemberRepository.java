package com.thusitha.library.repository;

import com.thusitha.library.model.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member,Integer> {

}
