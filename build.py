import subprocess
import os

def get_latest_tag():
    list_tags_command = 'docker image ls --format "{{.Tag}}" user-service'

    process = subprocess.Popen(list_tags_command, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    stdout, stderr = process.communicate()

    tags = stdout.decode('utf-8').split()
    if tags:
        latest_tag = max(tags)
        return latest_tag
    return None

def prompt_new_tag(current_tag):
    if current_tag:
        tag_number = int(current_tag.split('.')[-1])
        new_tag_number = tag_number + 1
        return f"{current_tag.rsplit('.', 1)[0]}.{new_tag_number}"
    else:
        return input("Insira uma nova tag para a imagem: ")

def build_docker_image():
    current_dir = os.getcwd()

    latest_tag = get_latest_tag()

    new_tag = prompt_new_tag(latest_tag)

    build_command = f'docker build -t user-service:{new_tag} {current_dir}'

    process = subprocess.Popen(build_command, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    stdout, stderr = process.communicate()

    if process.returncode != 0:
        print(f"Ocorreu um erro ao construir a imagem: {stderr.decode('utf-8')}")
    else:
        print(f"Imagem foi construída com sucesso: nome-da-sua-imagem:{new_tag}")

if __name__ == "__main__":
    build_docker_image()
