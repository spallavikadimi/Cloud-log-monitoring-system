☁️ Real-Time Cloud Log Monitoring System (SplunkLite)

A lightweight enterprise-style log monitoring platform built using Spring Boot for real-time log ingestion, centralized storage, dashboard analytics, and alerting.

It simulates modern observability tools like Splunk and ELK, making it ideal for academic projects, learning environments, and small-scale cloud deployments.



🚀 Features

✅ Real-time log generation and ingestion  
✅ Centralized log storage using H2 Database  
✅ Log severity classification (INFO, WARNING, ERROR)  
✅ REST API for log retrieval and search  
✅ Interactive dashboard using Thymeleaf + Chart.js  
✅ Project-wise log monitoring  
✅ Search and severity filtering  
✅ Live analytics charts and trend visualization  
✅ Automatic refresh for live log updates  
✅ Theme switching (Dark / Light mode)  
✅ Email alert system for ERROR logs  
✅ Lightweight and scalable modular design  



🏗️ System Architecture

```text
Client → Log Generator → Spring Boot Server → H2 Database → REST API → Dashboard UI → Analytics & Alerts
```



🧰 Technologies Used

Java 17 • Spring Boot • Spring Data JPA • H2 Database • Thymeleaf • Chart.js • Maven • HTML • CSS • JavaScript



⚙️ How to Run

1️⃣ Clone the repository  
git clone https://github.com/spallavikadimi/Cloud-log-monitoring-system.git  

2️⃣ Open in IntelliJ IDEA as Maven Project  

3️⃣ Run the main file: ClmsApplication.java  

4️⃣ Open in browser: http://localhost:8080/



🔌 API Endpoints

GET /api/logs → Retrieve all logs  
POST /api/logs → Add new log  
GET /api/logs/severity/{level} → Filter by severity  
GET /api/logs/search?keyword=error → Search logs  



📊 Dashboard Modules

🏠 Home Dashboard  
• Total logs  
• Error logs  
• Warning logs  
• Project statistics  

📂 Project Monitoring  
• Cloud server logs  
• API monitoring  
• Security event logs  
• Search + filtering  

📈 Analytics  
• Severity bar chart  
• Log trend line chart  

🚨 Alerts  
• Automatic ERROR detection  
• Console + Email notifications  

⚙️ Settings  
• Theme switch  
• UI customization  



📊 Sample Output

Logs are generated automatically every few seconds:

INFO → normal logs  
WARNING → potential issues  
ERROR → critical failures  

Example:
```text
2026-04-14T10:15:00 | Server-1 | Log generated: ERROR | ERROR
```



🚨 Alerts

The system automatically triggers alerts when ERROR logs are detected.

✅ Console alerts  
✅ Email alerts using SMTP  
✅ Dashboard alert panel  



📈 Future Enhancements

• Kafka / RabbitMQ real-time streaming  
• Cloud deployment on AWS / Azure  
• ML-based anomaly detection  
• Multi-application centralized logging  
• Role-based authentication  
• Microservices architecture  
• Predictive failure analytics  



💡 Use Cases

✔ Cloud application monitoring  
✔ API performance tracking  
✔ Security event logging  
✔ Academic mini/major projects  
✔ Learning Spring Boot architecture  
✔ Real-time dashboard development  



👩‍💻 Team Members

Pallavi  
Yaswitha  
Sushma  
Rohit  



🙏 Acknowledgements

This project was developed with the support of modern open-source technologies, frameworks, and libraries that enabled efficient implementation and seamless integration.

Special thanks to the Spring Boot ecosystem and web development tools that contributed to building this real-time monitoring solution.




📜 License

Developed for academic purposes as part of a final year B.Tech project.

Free to use for learning, educational, and research purposes.



© 2026 Real-Time Cloud Log Monitoring System Team  
All rights reserved.
