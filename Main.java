����   ; ~  WorkSpace/Main  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LWorkSpace/Main; main ([Ljava/lang/String;)V  WorkSpace/Instructor  Wep Program  Expert
     '(Ljava/lang/String;Ljava/lang/String;)V  C
     setSpecialist (Ljava/lang/String;)V   Beginner
  " #  setTraining	 % ' & java/lang/System ( ) out Ljava/io/PrintStream;
  + , - getSpecialist ()Ljava/lang/String;
 / 1 0 java/io/PrintStream 2  println 4 WorkSpace/Student 6 Java + React 8 17000 : Antalya
 3 <  = 9(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V ? 1650 
 3 A B  setCartInfo D Python 
 3 F G  setCourseName I Manisa 
 3 K L  	setAdress
 3 N O - getCourseName Q WorkSpace/User S Ricardo  U 	Quaresma  W info@besiktas.com 
 P Y  Z ;(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V \ java/lang/StringBuilder
 P ^ _ - getFirstName
 a c b java/lang/String d e valueOf &(Ljava/lang/Object;)Ljava/lang/String;
 [ g  
 P i j - getLastName
 [ l m n append -(Ljava/lang/String;)Ljava/lang/StringBuilder; p kursuna kayıt edildi.
 [ r s - toString args [Ljava/lang/String; 
instructor LWorkSpace/Instructor; student LWorkSpace/Student; user LWorkSpace/User; 
SourceFile 	Main.java !               /     *� �    
                    	       �     �� Y� L+� +� !� $+� *� .� 3Y579� ;M,>� @,C� E,H� J� $,� M� .� PY%RTV� XN� $� [Y-� ]� `� f-� h� k,� M� ko� k� q� .�    
   2          	 "  0  6  <  B  L  ^  �     *    � t u    } v w  0 Y x y  ^ + z {   |    }