# CPU Scheduling Algorithms – Project Report

## 1. Project Overview
Bu projede işletim sistemlerinde kullanılan temel CPU zamanlama algoritmaları
uygulanmış ve farklı senaryolar altında performansları karşılaştırılmıştır.
Uygulama Java dili ile geliştirilmiştir ve süreç bilgileri CSV dosyalarından
okunmaktadır.

## 2. Test Scenarios
Projede iki farklı senaryo bulunmaktadır:
- **Case 1:** Süreçlerin CPU burst süreleri artan şekilde verilmiştir.
- **Case 2:** Daha değişken CPU burst sürelerine sahip süreçler kullanılmıştır.

Her iki senaryo da aynı algoritmalar için ayrı ayrı test edilmiştir.

## 3. Implemented Scheduling Algorithms
Aşağıdaki zamanlama algoritmaları uygulanmıştır:
- First Come First Served (FCFS)
- Shortest Job First (Non-Preemptive)
- Shortest Job First (Preemptive)

Her algoritma için ortalama bekleme süresi ve ortalama tamamlanma süresi
hesaplanmıştır.

## 4. Performance Metrics
Algoritmalar aşağıdaki kriterlere göre değerlendirilmiştir:
- Ortalama Bekleme Süresi (Average Waiting Time)
- Ortalama Tamamlanma Süresi (Average Turnaround Time)

Hesaplanan değerler konsol çıktısı olarak gösterilmiştir.

## 5. Observations
SJF tabanlı algoritmaların, FCFS algoritmasına göre daha düşük ortalama
bekleme ve tamamlanma süreleri sağladığı gözlemlenmiştir.
Özellikle preemptive SJF algoritması, kısa süreli işlemleri daha erken
tamamlayarak sistem verimliliğini artırmıştır.

## 6. Conclusion
Bu çalışma ile CPU zamanlama algoritmalarının sistem performansı üzerindeki
etkileri gözlemlenmiştir. Elde edilen sonuçlar, teorik bilgilerin pratik
uygulamalarla uyumlu olduğunu göstermektedir.
