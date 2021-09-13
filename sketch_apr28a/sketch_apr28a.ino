void setup() {
  // put your setup code here, to run once:
  pinMode(10, OUTPUT);
  Serial.begin(115200);
}

void loop() {
  // put your main code here, to run repeatedly:
  int valorRecebido;
  if(Serial.available()){
    valorRecebido = Serial.read();

      if(valorRecebido == '0') {
        digitalWrite(10, LOW);
      } else {
        digitalWrite(0, HIGH);
      }
  }
}
