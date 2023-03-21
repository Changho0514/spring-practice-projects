package org.example.GradeCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * 요구사항
 * 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
 * MVC패턴(Model-View-Controller) 기반으로 구현한다.
 * 일급 컬렉션 사용
 */

/**
 * 고민 단계
 * 1. 도메인을 구성하는 객체에는 어떤 것들이 있는지 고민
 * 2. 객체들 간의 관계를 고민
 * 3. 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링 하기
 * 4. 협력을 설계
 * 5. 객체들을 포괄하는 타입에 적절한 책임을 할당
 * 6. 구현하기
 */
public class GradeCalculatorTest {
    // 학점 계산기 도메인 : 이수한 과목(객체지향프로그래밍, 자료구조, 중국어회화), 학점 계산기
    // 이수한 과목 : 객체지향프로그래밍, 자료구조, 중국어회화 --> 객체 3가지
    // 동적인 객체를 정적인 타입(클래스)으로 추상화

    //이수한 과목을 전달하여 평균학점 계산 요청 ---> 학점 계산기

    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        //given
        List<Course> courses = List.of(new Course("OOP", 3,"A+"),
                                    new Course("자료구조", 3, "A+"));
        //when
        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        //then
        Assertions.assertThat(gradeResult).isEqualTo(4.5);

    }
}

