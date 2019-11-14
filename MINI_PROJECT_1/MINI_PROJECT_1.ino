const int voltage_sensor = A2;
float voltage;
float volt;
int offset = 8;
void setup() {
  Serial.begin(9600);
}

void loop() {
 //Voltage
 volt = analogRead(voltage_sensor);
 voltage = map(volt,0,1023,0,2500) + offset;
 voltage /= 100;
 Serial.print("Voltage :");
 Serial.print(voltage);
 Serial.println("V");
 delay(1000);
 }
