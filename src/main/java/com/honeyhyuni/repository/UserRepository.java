package com.honeyhyuni.repository;

import com.honeyhyuni.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final EntityManager em;

    // 저장
    public void save(User user){
        em.persist(user);
    }
    //조회
    public User find(int id){
        return em.find(User.class, id);
    }
    //전체 조회
    public List<User> findAll(){
        return em.createQuery("select m from User m", User.class).getResultList();
    }
    //회원 이름으로 조회
    public List<User> findByName(String name){
        return em.createQuery("select m from User m where m.name = :name", User.class)
                .setParameter("name", name).getResultList();
    }
    
    //회원 이름으로 단건 조회
    public User findOneByName(String name){
        return em.createQuery("select m from User m where m.name = :name", User.class)
                .setParameter("name", name).getSingleResult();
    }

}
