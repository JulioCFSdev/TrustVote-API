CREATE TABLE user_credentials (
    user_credentials_id TEXT PRIMARY KEY UNIQUE NOT NULL,
    username TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    cpf TEXT NOT NULL,
    phone_number TEXT NOT NULL
)