const int ledVermelho = 4;
const int ledAmarelo = 2;
const int ledVerde = 5;

const int trPin = 12;
const int ecPin = 13;
float duracao_us, distancia_cm;

void setup()
{
  pinMode(ledVermelho, OUTPUT);
  pinMode(ledVerde, OUTPUT);
  pinMode(ledAmarelo, OUTPUT);
  pinMode(trPin, OUTPUT);  
  pinMode(ecPin, INPUT);


}

void loop()
{
  digitalWrite(trPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trPin, LOW);
  
  duracao_us = pulseIn(ecPin, HIGH);
  distancia_cm = 0.017 * duracao_us;

  if(distancia_cm<10){
  	digitalWrite(ledVermelho, HIGH);
  	digitalWrite(ledVerde, LOW);
  	digitalWrite(ledAmarelo, LOW);
  }else if(distancia_cm<20){
  	digitalWrite(ledVermelho, LOW);
  	digitalWrite(ledVerde, LOW);
  	digitalWrite(ledAmarelo, HIGH);
  }else if(distancia_cm>20){
    digitalWrite(ledVermelho, LOW);
  	digitalWrite(ledVerde, HIGH);
  	digitalWrite(ledAmarelo, LOW);
  }
  
  delay(500);
  
}