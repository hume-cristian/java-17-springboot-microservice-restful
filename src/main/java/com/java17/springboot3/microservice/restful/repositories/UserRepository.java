package com.java17.springboot3.microservice.restful.repositories;

import com.java17.springboot3.microservice.restful.models.UserModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Hume Cristian
 * @version 1.0.0
 * @since 2024-11-25
 */
@Repository
public class UserRepository {

    public List<UserModel> FindAll() {
        List<UserModel> userModelList = new ArrayList<>();

        userModelList = this.FindHardCodedData();

        return userModelList;
    }

    private List<UserModel> FindHardCodedData() {
        List<UserModel> userModelList = new ArrayList<>();

        userModelList.add(UserModel.builder()
                .id(1)
                .firstName("Bjarne")
                .lastName("Stroustrup")
                .nationality("Danish")
                .occupation("Computer Scientist")
                .email("bjarne.stroustrup@email.com")
                .phone("1-493-170-9623")
                .build());

        userModelList.add(UserModel.builder()
                .id(2)
                .firstName("James")
                .lastName("Gosling")
                .nationality("Canadian")
                .occupation("Computer Scientist")
                .email("james.gosling@email.com")
                .phone("2-663-123-4447")
                .build());

        userModelList.add(UserModel.builder()
                .id(3)
                .firstName("Guido")
                .lastName("Van Rossum")
                .nationality("Netherlands")
                .occupation("Benevolent Dictator for Life")
                .email("guido.van.rossum@email.com")
                .phone("3-770-736-8031")
                .build());

        userModelList.add(UserModel.builder()
                .id(4)
                .firstName("Anders")
                .lastName("Hejlsberg")
                .nationality("Danish")
                .occupation("Lead Systems Architect")
                .email("anders.hejlsberg@email.com")
                .phone("4-024-976-6794")
                .build());

        userModelList.add(UserModel.builder()
                .id(5)
                .firstName("Yukihiro")
                .lastName("Matsumoto")
                .nationality("Japanese")
                .occupation("Computer Scientist")
                .email("yukihiro.matsumoto@email.com")
                .phone("5-024-976-6794")
                .build());

        return userModelList;
    }

}
