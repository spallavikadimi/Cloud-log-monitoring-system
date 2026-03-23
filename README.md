☁️ Cloud Log Monitoring System (CLMS)

📌 Overview
This project is a lightweight Cloud Log Monitoring System built using Spring Boot.  
It collects logs from different sources, stores them centrally, and provides real-time monitoring with alerts and visualization.


🚀 Features

- ✅ Real-time log generation and ingestion
- ✅ Centralized log storage (H2 Database)
- ✅ Log severity classification (INFO, WARNING, ERROR)
- ✅ REST API for log retrieval
- ✅ Real-time dashboard (Thymeleaf UI)
- ✅ Search and filtering functionality
- ✅ Email alert system for ERROR logs
- ✅ Lightweight and scalable design


🏗️ System Architecture

Client → Log Generator → Spring Boot Server → Database → Dashboard UI


🧰 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database
- Thymeleaf
- Maven


⚙️ How to Run

1. Clone the repository:
```bash
git clone https://github.com/spallavikadimi/Cloud-log-monitoring-system.git

2. Open in IntelliJ IDEA

3. Run:
ClmsApplication.java

4. Open browser:

👉 Logs API:

http://localhost:8080/logs


👉 Dashboard:

http://localhost:8080/dashboard

📊 Sample Output

Logs are generated every few seconds:

INFO → normal logs
WARNING → potential issues
ERROR → critical alerts

🚨 Alerts

Console alerts for ERROR logs
Email alerts using SMTP (Gmail)

📈 Future Enhancements

Graph-based visualization
Machine learning anomaly detection
Cloud deployment (AWS)


💡 Acknowledgements

Our college and faculty for guidance and support.
Open-source frameworks and libraries used in the project.
Team members for collaboration and dedication.

👩‍💻 Team Members

- Pallavi  
- Yaswitha  
- Sushma  
- Rohit  

📜 License

This project is developed for academic purposes as part of a final year B.Tech project.  
It is free to use for learning and educational use only.

© Copyright

© 2026 Cloud Log Monitoring System Team. All rights reserved.
