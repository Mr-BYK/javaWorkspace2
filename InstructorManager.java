����   ; =  WorkSpace/InstructorManager  WorkSpace/UserManager <init> ()V Code
  	   LineNumberTable LocalVariableTable this LWorkSpace/InstructorManager; add (LWorkSpace/User;)V	    java/lang/System   out Ljava/io/PrintStream;  java/lang/StringBuilder  Instructor 
     (Ljava/lang/String;)V
     WorkSpace/User ! " getFirstName ()Ljava/lang/String;
  $ % & append -(Ljava/lang/String;)Ljava/lang/StringBuilder; (   *  added.
  , - " toString
 / 1 0 java/io/PrintStream 2  println user LWorkSpace/User; remove 7  remove. update :  update. 
SourceFile InstructorManager.java !               /     *� �    
                           \     $� � Y� +� � #'� #)� #� +� .�    
   
    	 # 
        $       $ 3 4   5      \     $� � Y� +� � #'� #6� #� +� .�    
   
     #         $       $ 3 4   8      \     $� � Y� +� � #'� #9� #� +� .�    
   
     #         $       $ 3 4   ;    <