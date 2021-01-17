/*
 water level controller with display by mrmodder.com
 HC-SR04 Ping distance sensor:
 VCC to arduino 5v 
 GND to arduino GND
 Echo to Arduino pin 9 
 Trig to Arduino pin 8*/
 /* LCD RS pin to digital pin 12
 * LCD Enable pin to digital pin 11
 * LCD D4 pin to digital pin 5
 * LCD D5 pin to digital pin 4
 * LCD D6 pin to digital pin 3
 * LCD D7 pin to digital pin 2
 * LCD R/W pin to ground
 * 10K resistor:
 * ends to +5V and ground
 * wiper to LCD VO pin (pin 3)*/

#include<LiquidCrystal.h> // include the library code for lcd
LiquidCrystal lcd(12, 11, 5, 4, 3, 2); //  
#define echopin  9 // echo pin
#define trigpin 8 // Trigger pin

int maximumRange = 50;
long duration, distance;
String data;
int Buzzer = 7;
int relay = 10;
void setup() {
  lcd.begin(16,2);
  Serial.begin (9600);
  pinMode (trigpin, OUTPUT);
  pinMode (echopin, INPUT );
  pinMode (4, OUTPUT);
  pinMode (relay,OUTPUT);
  pinMode(Buzzer,OUTPUT);
}
  
void loop ()
{
  digitalWrite(trigpin,LOW);
    delayMicroseconds(2);
    
    digitalWrite(trigpin,HIGH);
    delayMicroseconds(10);
    
    duration=pulseIn (echopin,HIGH);
    
    distance= duration/58.2;
    Serial.println(distance);
    delay (50);
    Serial.println(distance);
    lcd.clear();
    lcd.setCursor(0,0);
    lcd.print("water level :");
    lcd.print(distance);
    delay(100);
 if (distance >= 50 ){
   digitalWrite (7,HIGH);// connect to relay(motor)
   digitalWrite (relay,LOW);
   lcd.setCursor(0,1);
   lcd.setCursor(7, 1); 
   lcd.print("Motor Started");
   Serial.print("motor started");
   delay(100);
 }
 else if (distance <=5) {
   digitalWrite (7,LOW); // connect to relay(motor)
   digitalWrite (relay,HIGH);
   lcd.setCursor(0,1);
   lcd.print("Tank is full");
    Serial.print("motor stoped");
   delay(100);
  
 }
 
}
