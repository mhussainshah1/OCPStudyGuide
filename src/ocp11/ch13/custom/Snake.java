package ocp11.ch13.custom;

import java.lang.annotation.Repeatable;

@interface Scaley{}
@interface Flexible{}

@interface Foods{
    Food[] value();
}
@Repeatable(Foods.class) @interface Food{
    String value();
}
@interface FriendlyPet{}
@interface Limbless{}

@Scaley @Flexible
@Food("insect") @Food("rodent") @FriendlyPet
@Limbless public class Snake {

}