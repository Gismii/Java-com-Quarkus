# Use uma imagem base do PostgreSQL
FROM postgres:latest

# Defina as variáveis de ambiente do PostgreSQL
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD root
ENV POSTGRES_DB postgres

# Copie os scripts SQL para inicializar o banco de dados


# Exponha a porta padrão do PostgreSQL (5432)
EXPOSE 5440
