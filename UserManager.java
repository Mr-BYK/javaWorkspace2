����   ; C  WorkSpace/UserManager  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LWorkSpace/UserManager; add (LWorkSpace/User;)V	    java/lang/System   out Ljava/io/PrintStream;  java/lang/StringBuilder
    WorkSpace/User   getFirstName ()Ljava/lang/String;
  !   java/lang/String " # valueOf &(Ljava/lang/Object;)Ljava/lang/String;
  %  & (Ljava/lang/String;)V (  user added.
  * + , append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  . /  toString
 1 3 2 java/io/PrintStream 4 & println user LWorkSpace/User; remove 9  user remove. update <  user update. '(Ljava/lang/String;Ljava/lang/String;)V string Ljava/lang/String; string2 
SourceFile UserManager.java !               /     *� �    
                           U     � � Y+� � � $'� )� -� 0�    
   
                      5 6   7      U     � � Y+� � � $8� )� -� 0�    
   
    
                  5 6   :      U     � � Y+� � � $;� )� -� 0�    
   
                      5 6    =     ?      �    
                        > ?     @ ?   A    B