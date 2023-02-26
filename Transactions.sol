// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.7.0 <0.9.0;

contract Transactions {
    struct Deposit {
        uint value;
        uint timestamp;
    }

    struct Transfer {
        uint value;
        uint timestamp;
        address _sender;
    }

    mapping(address=>Deposit[]) depositsFrom; 
    mapping(address=>Transfer[]) transfersTo;

    constructor() {
        
    }

    // function getAllDepositsFrom(address _sender) external view returns(Deposit[] memory) {
    //     return depositsFrom[_sender];
    // }

    // function getAllTransfersTo(address _recipient) external view returns(Transfer[] memory) {
    //     return transfersTo[_recipient];
    // }

    function getBalance() external view returns(uint) {
        return address(this).balance;
    }


    // 1. Price in ETH, Pay in ETH
    // Algorithm:
    // i. Sender Account sends money to Smart Contract Account
    function depositETH() external payable {
        if(msg.value < 1000) {
            revert();
        }

        depositsFrom[msg.sender].push(Deposit(msg.value, block.timestamp));
    }
    // ii. Smart Contract sends money to Recipient's Account
    function transferETH(address _recipient, uint _amount) external {
        address payable payableAddress = payable(_recipient);
        payableAddress.transfer(_amount);

        transfersTo[_recipient].push(Transfer(_amount, block.timestamp, msg.sender));
    }


    // 2. Price in ETH, Pay in USD/INR
    // Algorithm:
    // i. Get current price of ETH in USD
    
    // ii. [FRONTEND] Make transaction on the FRONTEND in the said USD amount 
    // iii. Transfer the required ETH from Smart Contract to the Recipient
    // [using the transferETH(_recipient, _amount)]


    // 3. Price in USD, Pay in ETH
    // Algorithm:
    // i. [FRONTEND] Get USD to ETH conversions using a live API
    // ii. Deposit the same amount of ETH to the Smart Contract
    // [ using depositETH(address) ]
    // iii. [FRONTEND] Make payments to the Recipient in the FRONTEND

}