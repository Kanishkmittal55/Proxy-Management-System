CREATE TABLE IF NOT EXISTS proxy_config (
    id SERIAL PRIMARY KEY,
    location VARCHAR(255),
    port INTEGER,
    user_auth_required BOOLEAN,
    credentials VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS health_status (
    id SERIAL PRIMARY KEY,
    container_id VARCHAR(255),
    is_healthy BOOLEAN,
    cpu_usage DOUBLE PRECISION,
    memory_usage DOUBLE PRECISION
);

CREATE TABLE IF NOT EXISTS container_log (
    id SERIAL PRIMARY KEY,
    container_id VARCHAR(255),
    log_level VARCHAR(50),
    timestamp TIMESTAMP,
    message TEXT
);

CREATE TABLE IF NOT EXISTS proxy (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    container_id VARCHAR(255),
    external_ip VARCHAR(255),
    location VARCHAR(255),
    status VARCHAR(50)
);
