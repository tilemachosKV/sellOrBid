# Dockerfile for Angular application
# Base image
FROM  alpine:3.21.3

# Install Node.js and npm
RUN apk add --no-cache nodejs npm

# Working directory
WORKDIR /frontendapp

# Copy package.json and package-lock.json to the working directory
# in order to install dependencies
COPY package*.json ./

# Install dependencies
RUN npm install

# Install Angular CLI globally
RUN npm install -g @angular/cli

# Copy the rest of the application code to the working directory
COPY . .

# Expose the port the app runs on
EXPOSE 4200

# Start the application 
# Important: Use --host 0.0.0 to allow external access
CMD ["npm", "start", "--", "--host", "0.0.0.0"] 

