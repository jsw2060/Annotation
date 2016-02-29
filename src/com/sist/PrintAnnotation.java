package com.sist;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by sist on 2016-02-29.
 * -annotation 의미 : Java class 파일에 meta 정보를 기술하여
 *                      meta 정보를 프로그래밍에 활용하는 방식.
 * -annotation 용도 :
 *          - 컴파일러에게 코드 작성 문법 에러 체크하도록 정보 제공.
 *              예)@Override
 *          - 소프트웨어 개발 툴이 빌드, 배치 시 코드를 자동 생성하게 정보 제공.
 *          - 실행(Run-Time)시 특정 기능 실행하도록 정보 제공.
 *
 * -annotation target 종류 :
 *          - TYPE : class,interface,enum에서 사용가능.
 *          - FIELD : field에 사용가능.
 *          - METHOD : method에 사용가능.
 *
 * -annotation 타입 정의
 *      - 기본 엘리먼트 value
 *          - 어노테이션 적용할 때 엘리먼트 이름 생략 가능.
 * -annotation 사용
 *
 * -annotation 유지 정책
 *      - 어노테이션 적용 코드가 유지되는 시점을 지정하는 것
 *      -SOURCE
 *          -
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
    String value() default "-";
    int number() default 15;
}
