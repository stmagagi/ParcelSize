FROM openjdk:alpine

RUN mkdir APP

# im Kontainer (virt Rechner)
COPY . APP/.
# im Kontainer (virt Rechner)
WORKDIR APP

ENV LANG C.UTF-8

RUN ls -al ./build/libs/