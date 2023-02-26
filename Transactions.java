

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.6.0.
 */
public class Transactions extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506103bc806100206000396000f3fe6080604052600436106100345760003560e01c806312065fe0146100395780637b1a490914610064578063f6326fb31461008d575b600080fd5b34801561004557600080fd5b5061004e610097565b60405161005b919061029c565b60405180910390f35b34801561007057600080fd5b5061008b60048036038101906100869190610346565b61009f565b005b6100956101e0565b005b600047905090565b8173ffffffffffffffffffffffffffffffffffffffff166108fc829081150290604051600060405180830381858888f193505050501580156100e5573d6000803e3d6000fd5b50600160008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060405180606001604052808381526020014281526020013373ffffffffffffffffffffffffffffffffffffffff168152509080600181540180825580915050600190039060005260206000209060030201600090919091909150600082015181600001556020820151816001015560408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555050505050565b6103e83410156101ef57600080fd5b6000803373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020604051806040016040528034815260200142815250908060018154018082558091505060019003906000526020600020906002020160009091909190915060008201518160000155602082015181600101555050565b6000819050919050565b61029681610283565b82525050565b60006020820190506102b1600083018461028d565b92915050565b600080fd5b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b60006102e7826102bc565b9050919050565b6102f7816102dc565b811461030257600080fd5b50565b600081359050610314816102ee565b92915050565b61032381610283565b811461032e57600080fd5b50565b6000813590506103408161031a565b92915050565b6000806040838503121561035d5761035c6102b7565b5b600061036b85828601610305565b925050602061037c85828601610331565b915050925092905056fea26469706673582212208cd73fa1bba5cc679b66edcb08ecb9a727c448771d4e5ade276e7a45dd88873f64736f6c63430008110033";

    public static final String FUNC_DEPOSITETH = "depositETH";

    public static final String FUNC_TRANSFERETH = "transferETH";

    public static final String FUNC_GETBALANCE = "getBalance";

    @Deprecated
    protected Transactions(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Transactions(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Transactions(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Transactions(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> depositETH() {
        final Function function = new Function(
                FUNC_DEPOSITETH, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> transferETH(String _recipient, BigInteger _amount) {
        final Function function = new Function(
                FUNC_TRANSFERETH, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_recipient), 
                new org.web3j.abi.datatypes.generated.Uint256(_amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Transactions> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Transactions.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<Transactions> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Transactions.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Transactions> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Transactions.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Transactions> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Transactions.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public RemoteCall<TransactionReceipt> getBalance() {
        final Function function = new Function(
                FUNC_GETBALANCE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Transactions load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Transactions(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Transactions load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Transactions(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Transactions load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Transactions(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Transactions load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Transactions(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
