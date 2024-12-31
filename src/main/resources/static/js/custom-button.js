class CustomButton extends HTMLElement {
    constructor() {
        super();
        const shadow = this.attachShadow({ mode: 'open' });

        // Create a button element
        const button = document.createElement('button');
        button.textContent = this.getAttribute('label') || 'Click Me';

        // Add styles
        const style = document.createElement('style');
        style.textContent = `
            button {
                background-color: #6200EA;
                color: white;
                padding: 10px 20px;
                border: none;
                border-radius: 5px;
                cursor: pointer;
                transition: background-color 0.3s ease;
            }
            button:hover {
                background-color: #3700B3;
            }
        `;

        shadow.appendChild(style);
        shadow.appendChild(button);
    }
}

// Define the new element
customElements.define('custom-button', CustomButton);
