INSERT INTO cliente (nome, email)
SELECT 'João Silva', 'joao@email.com'
WHERE NOT EXISTS (SELECT * FROM cliente WHERE email = 'joao@email.com');

INSERT INTO cliente (nome, email)
SELECT 'Maria Santos', 'maria@email.com'
WHERE NOT EXISTS (SELECT * FROM cliente WHERE email = 'maria@email.com');