# Mikroservis Mimarisi Denemesi

Bu proje, **Redis**, **Docker**, **Gradle**, **OpenFeign** ve **Spring Cloud** kullanarak mikroservis mimarisi denemeleri için hazırlanmıştır.

## Amaç

Kullanıcı, email, kullanıcı adı ve şifre ile kayıt olur.  
**Auth Servisi**, kayıt işleminden sonra **User Profile Servisi**’ni tetikleyerek kullanıcı için bir profil oluşturur.  
Bu yapı sadece demo amaçlıdır, servislerin içeriği kabataslaktır.

## Kullanılan Teknolojiler

- Spring Boot
- Spring Cloud Config (GitHub üzerinden config)
- Docker
- Redis, PostgreSQL, MongoDB (Docker container olarak)
- OpenFeign (servisler arası iletişim)
- Swagger (API dokümantasyonu)
- Gradle ile modüler bağımlılık yönetimi
  
